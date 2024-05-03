public class NotaFiscal {
        private int id;
        private int usuario_id;
        private String chave;
        private String sequencial;

        public NotaFiscal(int id, int usuario_id, String chave, String sequencial) {
            this.id = id;
            this.usuario_id = usuario_id;
            this.chave = chave;
            this.sequencial = sequencial;
        }

        // Getters e Setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getUsuario_id() {
            return usuario_id;
        }

        public void setUsuario_id(int usuario_id) {
            this.usuario_id = usuario_id;
        }

        public String getChave() {
            return chave;
        }

        public void setChave(String chave) {
            this.chave = chave;
        }

        public String getSequencial() {
            return sequencial;
        }

        public void setSequencial(String sequencial) {
            this.sequencial = sequencial;
        }
}
