package ����������.proxy;

public class RealImage implements Image {
	private String fileName;
    
    public RealImage(String fileName) {
    	this.fileName = fileName;
    }
    
    private void loadFromDisk(String fileName) {
    	System.out.println("�ε�: " + fileName);
    }
    
    @Override
    public void displayImage() {
        System.out.println("�����ֱ�: " + fileName);
    }
}
