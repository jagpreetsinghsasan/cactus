package tpls

const Kind = `
kind: Cluster
apiVersion: kind.x-k8s.io/v1alpha4
nodes:
{{ $IncrementedControlPaneCount := .ControlPlaneCount | add1 | int }}
{{ range $i, $e := untilStep 1 $IncrementedControlPaneCount 1 }}
- role: control-plane
  image: kindest/node:v1.27.11@sha256:681253009e68069b8e01aad36a1e0fa8cf18bb0ab3e5c4069b2e65cafdd70843
{{ end }}
{{ $IncrementedWorkerCount := .WorkerNodeCount | add1 | int }}
{{ range $i, $e := untilStep 1 $IncrementedWorkerCount 1 }}
- role: worker
  image: kindest/node:v1.27.11@sha256:681253009e68069b8e01aad36a1e0fa8cf18bb0ab3e5c4069b2e65cafdd70843
{{ end }}
`
