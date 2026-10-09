
    class MiHebra extends Thread {
        private char caracter;
        private int veces;

        public MiHebra(char caracter, int veces) {
            this.caracter = caracter;
            this.veces = veces;
        }

        @Override
        public void run() {
            for (int i = 0; i < veces; i++) {
                System.out.print(caracter);
            }
        }
    }

