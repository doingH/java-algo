package ����������.factory.decorator;

//���� �������̽��� �����ϰ�
public class RamenDecorator implements Noodle {
	
	//���� �������̽��� ��Ӻ����� ����
    private Noodle noodle;

    //������ ������ ���� ���� �������̽��� ����ü�� ����
    public RamenDecorator(final Noodle noodle) {
        this.noodle = noodle;
    }

    @Override
    public void assemble() {
    	//����ü���� �ٸ��� ������ assemble �޼ҵ带 ȣ��
        noodle.assemble();
    }
}