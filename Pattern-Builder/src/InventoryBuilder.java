public class InventoryBuilder {
	
	public PCStore stockLaptops(){
		PCStore store = new PCStore();
		store.addComp(new MacbookPro());
		store.addComp(new Netbook());
		return store;
	}
	
	public PCStore stockDesktops(){
		PCStore store = new PCStore();
		store.addComp(new GamingPC());
		store.addComp(new MultimediaPC());
		return store;
	}
}
