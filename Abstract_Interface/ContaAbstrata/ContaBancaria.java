public abstract class ContaBancaria {

        protected String cliete;
        protected int conta;
        protected Double saldo;

        public void sacar(Double valor){
            if(saldo >= valor ){
                saldo -= valor;
            }
        }

        public void depositar(Double valor){
            saldo+=valor;
        }

        public String getCliete() {
            return cliete;
        }

        public void setCliete(String cliete) {
            this.cliete = cliete;
        }

        public int getConta() {
            return conta;
        }

        public void setConta(int conta) {
            this.conta = conta;
        }

        public Double getSaldo() {
            return saldo;
        }
}
