package accessMode;

import access.Modifiers;

class AccessMode extends Modifiers{
	public static void main(String args[]){
		AccessMode am = new AccessMode();

		am.setPublic(10);
		am.setPrivate(20);
		am.setProtected(30);
		
		System.out.print("\nPublic value: " + am.getPublic() + "\nPrivate value: " + am.getPrivate() + "\nProtected value: " + am.getProtected());
	}
}