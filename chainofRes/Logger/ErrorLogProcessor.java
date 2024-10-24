package chainofRes.Logger;

public class ErrorLogProcessor extends LogProcessor {
    public ErrorLogProcessor(LogProcessor nexLogProcessor) {
        super(nexLogProcessor);
    }

    @Override
    public void log(int loglevel, String Msg) {
        if (loglevel == LogProcessor.ERROR) {
            System.out.println("DEBUG : " + Msg);
        } else {
            super.log(loglevel, Msg);
        }
    }
}
