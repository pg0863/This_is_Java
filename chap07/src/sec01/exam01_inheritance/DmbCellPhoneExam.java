package sec01.exam01_inheritance;

public class DmbCellPhoneExam {
	public static void main(String[] arsgs) {
		DmbCellphone dmbCellPhone = new DmbCellphone("자바폰","검정",10);
		
		System.out.println("모델 : "+dmbCellPhone.model);
		System.out.println("색상 : "+dmbCellPhone.color);
		System.out.println("채널 : "+dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("반갑습니다");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(20);
		dmbCellPhone.turnOnDmb();
	}
}
