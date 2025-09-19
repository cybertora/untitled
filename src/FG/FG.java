package FG;

public class FG {
    private String bars;
    private String frame;
    private String system;
    private String chain;
    private String saddle;


    private FG(Builder b) {
        this.bars = b.bars;
        this.frame = b.frame;
        this.system = b.system;
        this.chain = b.chain;
        this.saddle = b.saddle;
    }

    public String toString() {
        return  "Fixed gear: " +
                "bars= " + bars +
                ", frameMaterial= '" + frame + '\'' +
                ", system= '" + system + '\'' +
                ", chain= '" + chain + '\'' +
                ", saddle='" + saddle + '\'';
    }

    public static class Builder{
        private String bars = "handlebars";
        private String frame = "steel";
        private String system = "beclass";
        private String chain = "S1";
        private String saddle = "givny";

        public Builder bars(String bars){
            this.bars = bars;
            return this;
        }
        public Builder frame(String frame){
            this.frame = frame;
            return this;
        }
        public Builder system(String system){
            this.system = system;
            return this;
        }
        public Builder chain(String chain){
            this.chain = chain;
            return this;
        }
        public Builder saddle(String saddle){
            this.saddle = saddle;
            return this;
        }


        public FG build(){
            return new FG(this);
        }
    }
}
