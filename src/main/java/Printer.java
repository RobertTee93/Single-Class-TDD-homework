public class Printer {

    private int sheetsOfPaper;
    private int tonerVolume;

    public Printer(int sheetsOfPaper, int tonerVolume){
        this.sheetsOfPaper = sheetsOfPaper;
        this.tonerVolume = tonerVolume;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }

    public int getSheetsOfPaper() {
        return sheetsOfPaper;
    }

    public void print(int pages, int copies){
        int total = pages * copies;
        if (total <= sheetsOfPaper && tonerVolume >= total) {
            this.reduceToner(total);
            this.sheetsOfPaper -= total;
        }
    }

    public void fillPaper(){
        this.sheetsOfPaper = 100;
    }

    public void reduceToner(int pages){
        this.tonerVolume -= pages;
    }

    public void fillToner(){
        this.tonerVolume = 50;
    }
}
