public enum SEASON {
    AUTUMN(17){
        @Override
        public void getDESCRIPTION() {
            System.out.println("холодное");
        }
    },

    WINTER(-17) {
        @Override
        public void getDESCRIPTION() {
            System.out.println("холодное");
        }
    },
    SPRING(25) {
        @Override
        public void getDESCRIPTION() {
            System.out.println("теплое");
        }
    },
    SUMMER(30) {
        @Override
        public void getDESCRIPTION() {

        }
    };
      private double tem;


    public abstract void getDESCRIPTION( );


    SEASON(double tem) {
        this.tem = tem;
    }
}

