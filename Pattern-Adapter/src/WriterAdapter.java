public class WriterAdapter implements PerformanceArtist {
	Writer writer;
	public WriterAdapter(Writer writer){
		this.writer = writer;
	}
	public void perform() {
		writer.write();
	}
	public void showEgo() {
		writer.bookSigning();
	}
	public void fireManager() {
		throw new UnsupportedOperationException();
	}

}
