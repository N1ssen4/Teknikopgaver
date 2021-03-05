package model;

public class CitatMaker {
    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    private String quote;

    public CitatMaker(String quote){
        this.quote = quote;
    }

}

