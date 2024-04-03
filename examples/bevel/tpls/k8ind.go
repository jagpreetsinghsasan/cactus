package tpls

const Kind = `
kind: Cluster
apiVersion: kind.x-k8s.io/v1alpha4
nodes:
{{ $IncrementedControlPaneCount := .ControlPlaneCount | add1 | int }}
{{ range $i, $e := untilStep 1 $IncrementedControlPaneCount 1 }}
- role: control-plane
  image: kindest/node:v1.26.14@sha256:5d548739ddef37b9318c70cb977f57bf3e5015e4552be4e27e57280a8cbb8e4f
{{ end }}
{{ $IncrementedWorkerCount := .WorkerNodeCount | add1 | int }}
{{ range $i, $e := untilStep 1 $IncrementedWorkerCount 1 }}
- role: worker
  image: kindest/node:v1.26.14@sha256:5d548739ddef37b9318c70cb977f57bf3e5015e4552be4e27e57280a8cbb8e4f
{{ end }}
`
