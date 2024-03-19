package configure

type BevelConfig struct {
	LedgerType   string `json:"LedgerType"`
	GitUrl       string `json:"GitUrl"`
	GitUserName  string `json:"GitUserName"`
	GitToken     string `json:"GitToken"`
	GitUserEmail string `json:"GitUserEmail"`
}
