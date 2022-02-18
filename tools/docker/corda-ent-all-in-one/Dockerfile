FROM ubuntu:20.04

ENV DEBIAN_FRONTEND=noninteractive

ARG SAMPLES_KOTLIN_SHA=30fd841dd035934bae75ab8910da3b6e3d5d6ee7
ARG SAMPLES_KOTLIN_CORDAPP_SUB_DIR_PATH="./Advanced/obligation-cordapp/"

ENV CACTUS_CFG_PATH=/etc/hyperledger/cactus
RUN mkdir -p $CACTUS_CFG_PATH

WORKDIR /

RUN apt-get update
# Install curl to check if the CENM services are up and running
RUN apt-get install curl -y

# Install jdk8 as it is a dependency of Corda CENM 
RUN apt-get install openjdk-8-jdk -y

# Install ssh and sshpass for notary healthcheck
RUN apt-get install ssh -y
RUN apt-get install sshpass

# OpenSSH - need to have it so we can shell in and install/instantiate contracts and troubleshoot
RUN apt-get install openssh-server
RUN apt-get install augeas-tools -y

# Install git to clone the sample cordapps
RUN apt-get install git -y

# Configure the OpenSSH server we just installed
RUN augtool 'set /files/etc/ssh/sshd_config/AuthorizedKeysFile ".ssh/authorized_keys /etc/authorized_keys/%u"'
RUN augtool 'set /files/etc/ssh/sshd_config/PermitRootLogin yes'
RUN augtool 'set /files/etc/ssh/sshd_config/PasswordAuthentication yes'
RUN augtool 'set /files/etc/ssh/sshd_config/PermitEmptyPasswords yes'
RUN augtool 'set /files/etc/ssh/sshd_config/Port 22'
RUN augtool 'set /files/etc/ssh/sshd_config/LogLevel DEBUG2'
RUN augtool 'set /files/etc/ssh/sshd_config/LoginGraceTime 10'
# Create the server's key - without this sshd will refuse to start
RUN ssh-keygen -A

# Generate an RSA keypair on the fly to avoid having to hardcode one in the image
# which technically does not pose a security threat since this is only a development
# image, but we do it like this anyway.
RUN mkdir ~/.ssh
RUN chmod 700 ~/.ssh/
RUN touch ~/.ssh/authorized_keys
RUN ["/bin/bash", "-c", "ssh-keygen -t rsa -N '' -f $CACTUS_CFG_PATH/corda-aio-image <<< y"]
RUN mv $CACTUS_CFG_PATH/corda-aio-image $CACTUS_CFG_PATH/corda-aio-image.key
RUN cp $CACTUS_CFG_PATH/corda-aio-image.pub ~/.ssh/authorized_keys
RUN echo 'root:root' | chpasswd
RUN service ssh start

# Clone the sample smartcontract repository
RUN git clone https://github.com/corda/samples-kotlin.git
WORKDIR /samples-kotlin
RUN git checkout ${SAMPLES_KOTLIN_SHA}

RUN sed -i 's/4.8/4.7/g' Accounts/constants.properties
RUN sed -i 's/=10/=9/g' Accounts/constants.properties
RUN sed -i 's/4.8/4.7/g' Advanced/constants.properties
RUN sed -i 's/=10/=9/g' Advanced/constants.properties
RUN sed -i 's/4.8/4.7/g' Basic/constants.properties
RUN sed -i 's/=10/=9/g' Basic/constants.properties
RUN sed -i 's/4.8/4.7/g' BusinessNetworks/constants.properties
RUN sed -i 's/=10/=9/g' BusinessNetworks/constants.properties
RUN sed -i 's/4.8/4.7/g' Features/constants.properties
RUN sed -i 's/=10/=9/g' Features/constants.properties
RUN sed -i 's/4.8/4.7/g' Tokens/constants.properties
RUN sed -i 's/=10/=9/g' Tokens/constants.properties

WORKDIR /samples-kotlin/${SAMPLES_KOTLIN_CORDAPP_SUB_DIR_PATH}
RUN ./gradlew build deployNodes

WORKDIR /

# Install supervisord because we need to run the docker daemon and also the corda enterprise network
# meaning that we have multiple processes to run.
RUN apt-get install supervisor

COPY supervisord.conf /etc/supervisord.conf

RUN mkdir /home/cordapps
COPY idman.sh /
COPY notary-regis-and-nms.sh /
COPY notary.sh /
COPY node-regis.sh /
COPY partya.sh /
COPY partyb.sh /
COPY partyc.sh /
COPY healthcheck.sh /
ADD jars /home/
ADD cordapps /home/cordapps


# OpenSSH server
EXPOSE 22

# supervisord web ui/dashboard
EXPOSE 9001

# Notary RPC
EXPOSE 30001

# PartyA RPC
EXPOSE 31001

# PartyB RPC
EXPOSE 32001

# PartyC RPC
EXPOSE 33001

ENTRYPOINT ["/usr/bin/supervisord"]
CMD ["--configuration", "/etc/supervisord.conf", "--nodaemon"]

HEALTHCHECK --interval=1s --timeout=5s --start-period=5s --retries=500 CMD /healthcheck.sh
