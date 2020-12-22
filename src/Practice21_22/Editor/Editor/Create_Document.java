package Editor;

public class Create_Document extends ICreateDocument {
    @Override
    IDocument CreateNew() {
        return new Text_Document();
    }

    @Override
    IDocument CreateOpen() {
        return new Text_Document();
    }
}
