package event;

import java.util.Scanner;

public class event {
	public void event() {
		int sel;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. �̴��� �̺�Ʈ ����");
		System.out.println("2. ��ü �̺�Ʈ ����");
		sel = sc.nextInt();
		while (true) {
			switch (sel) {
			case 1:
				System.out.println("�̴��� �̺�Ʈ");
				System.out.println("��ź �ϵ�");
				break;
			case 2:
				System.out.println("��ü �̺�Ʈ ����");
				System.out.println("��ź �ϵ�");
				System.out.println("���Ű�� �ϵ�");
				System.out.println("��ũ����ư �ϵ�");
				System.out.println("�ƺ근���� �ϵ�");
				break;
			}
			break;
		}
	}
}
