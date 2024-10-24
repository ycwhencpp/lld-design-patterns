package chainofRes.Logger;

public class DebugLogProcessor extends LogProcessor {
    public DebugLogProcessor(LogProcessor nexLogProcessor) {
        super(nexLogProcessor);
    }

    @Override
    public void log(int loglevel, String Msg) {
        if (loglevel == LogProcessor.DEBUG) {
            System.out.println("DEBUG : " + Msg);
        } else {
            super.log(loglevel, Msg);
        }
    }

}
