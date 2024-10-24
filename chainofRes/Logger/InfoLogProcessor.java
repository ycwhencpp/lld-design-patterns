package chainofRes.Logger;

public class InfoLogProcessor extends LogProcessor {

    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int loglevel, String Msg) {
        if (LogProcessor.INFO == loglevel) {
            System.out.println("Info :" + Msg);
        } else {
            super.log(loglevel, Msg);
        }
    }
}
