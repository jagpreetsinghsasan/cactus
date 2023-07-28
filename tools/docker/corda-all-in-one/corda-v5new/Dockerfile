# DOCKER_BUILDKIT=1 docker build ./tools/docker/corda-all-in-one/corda-v5new -t newcordaimg
# docker run -it --rm --privileged -v /var/run/docker.sock:/var/run/docker.sock --network host -d newcordaimg

FROM cruizba/ubuntu-dind:20.10.9

RUN apt-get update
RUN apt -y upgrade

# Need curl for healthchecks
RUN apt-get -y install --no-install-recommends curl

# The file binary is used to inspect exectubles when debugging container image issues
RUN apt-get -y install --no-install-recommends file
RUN apt-get -y install --no-install-recommends ca-certificates
RUN apt-get -y install --no-install-recommends tzdata
RUN apt-get -y install --no-install-recommends gnupg

# Installing unzip to extract Corda CLI
RUN apt-get -y install unzip

#----------------- INSTALLING CORDA CDSE PREREQUISITES --------------------
#--------------------------------------------------------------------------

# Installing Zulu11 JDK 
RUN curl -s https://repos.azul.com/azul-repo.key | gpg --dearmor -o /usr/share/keyrings/azul.gpg
RUN echo "deb [signed-by=/usr/share/keyrings/azul.gpg] https://repos.azul.com/zulu/deb stable main" | tee /etc/apt/sources.list.d/zulu.list
RUN apt-get update
RUN apt-get install -y zulu11-jdk

## Exposing the required ports 5005, 5432 and 8888 for CSDE
## and 9001 for supervisor. Currently commented because of "--network host" being used to run the container
# EXPOSE 5005
# EXPOSE 5432
# EXPOSE 8888

# EXPOSE 9001

# Installing Corda CLI
RUN mkdir /platform-jars && \
    wget -O /platform-jars/binary.tar.gz \
    https://download.corda.net/c5-release-pack/E0b6f4f8-8907-47ae-b3cd-7f25ff756c2f-5.0.0-GA/platform-jars-5.0.0.tar.gz

RUN cd /platform-jars/ && \
    tar -xvzf binary.tar.gz && \
    cp net/corda/cli/deployment/corda-cli-installer/5.0.0.0/corda-cli-installer-5.0.0.0.zip . && \
    unzip corda-cli-installer-5.0.0.0.zip -d corda-cli-installer && \
    corda-cli-installer/./install.sh
ENV PATH="$PATH:~/.corda/cli"

#--------------------------------------------------------------------------
#--------------------------------------------------------------------------

# Installing CORDA CDSE
RUN apt-get install -y git
RUN git clone https://github.com/corda/CSDE-cordapp-template-java.git

RUN cd CSDE-cordapp-template-java/ && \
    git checkout release/corda-5-0

# Commenting these ports as we are using the host network for the containers to run at the moment
# EXPOSE 5005
# EXPOSE 5432
# EXPOSE 8888

# EXPOSE 9001

COPY supervisord.conf /etc/supervisord.conf

COPY 5vNodeSetup.sh /5vNodeSetup.sh
RUN chmod +x /5vNodeSetup.sh

WORKDIR /CSDE-cordapp-template-java/

# Extend the parent image's entrypoint
# https://superuser.com/questions/1459466/can-i-add-an-additional-docker-entrypoint-script
ENTRYPOINT ["/usr/bin/supervisord"]
CMD ["--configuration", "/etc/supervisord.conf", "--nodaemon"]

HEALTHCHECK --interval=10s --timeout=5s --start-period=100s --retries=1000 CMD [ -f 5vNodeSetupdone.txt ]