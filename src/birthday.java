import java.util.*;
public class birthday 
{

	//�p��P�y
	public static void zodiac(int M, int D)
	{
		System.out.print("�P�y:");
		//switch�P�_����A�N�P�y�d���Y�p�ܨ��
		switch(M)
		{
		case 1:
			//if/else�P�_����A�T�{�P�y����
			if(D<=20) {
				System.out.println("�]�~�y");
				System.out.println("�S��:�өʫO�u�A�Q���ԷV�ӥB���}");
			}
				
			else {
				System.out.println("���~�y");
				System.out.println("�S��:���H���ܡA�ܬ���]�ܦ���{�O�A�өʷũM");
			}
			break;
		case 2:
			if(D<=19) {
				System.out.println("���~�y");
				System.out.println("�S��:���H���ܡA�ܬ���]�ܦ���{�O�A�өʷũM");
			}
			else {
				System.out.println("�����y");
				System.out.println("�S��:�㦳�ϩʡB�l�ޤH�A�ϤH�ܼ֩�M�L�۳B");
			}
			break;	
		case 3:
			if(D<=20) {
				System.out.println("�����y");
				System.out.println("�S��:�㦳�ϩʡB�l�ޤH�A�ϤH�ܼ֩�M�L�۳B");
			}
			else {
				System.out.println("�զϮy");
				System.out.println("�S��:�㦳�гy�O�B���O�Q��");
			}
			break;
		case 4:
			if(D<=20) {
				System.out.println("�զϮy");
				System.out.println("�S��:�㦳�гy�O�B���O�Q��");
			}
			else {
				System.out.println("�����y");
				System.out.println("�S��:�����B�İʡB�X���B�ӷP�B�̿�");
			}
			break;
		case 5:
			if(D<=21) {
				System.out.println("�����y");
				System.out.println("�S��:�����B�İʡB�X���B�ӷP�B�̿�");
			}
			else {
				System.out.println("���l�y");
				System.out.println("�S��:���Ӱ��A�����֡A�åB�ਥ���D");
			}
			break;
		case 6:
			if(D<=21) {
				System.out.println("���l�y");
				System.out.println("�S��:���Ӱ��A�����֡A�åB�ਥ���D");
			}
			else {
				System.out.println("���ɮy");
				System.out.println("�S��:���H�Mħ�i�ˡA�]�ܦ��d���P");
			}
			break;
		case 7:
			if(D<=22) {
				System.out.println("���ɮy");
				System.out.println("�S��:���H�Mħ�i�ˡA�]�ܦ��d���P");
			}
			else {
				System.out.println("��l�y");
				System.out.println("�S��:�㦳���q�P�A�ͩʧּ֬���A�e���l�ޤH");
			}
			break;
		case 8:
			if(D<=22) {
				System.out.println("��l�y");
				System.out.println("�S��:�㦳���q�P�A�ͩʧּ֬���A�e���l�ޤH");
			}
			else {
				System.out.println("�B�k�y");
				System.out.println("�S��:�㦳���R�B�������ߡA�ӥB�R���F�H��");
			}
			break;
		case 9:
			if(D<=23) {
				System.out.println("�B�k�y");
				System.out.println("�S��:�㦳���R�B�������ߡA�ӥB�R���F�H��");
			}
			else {
				System.out.println("�ѯ��y");
				System.out.println("�S��:�ʮ�ũM�꺡�A�����Ƴ��O�����e���D");
			}
			break;
		case 10:
			if(D<=23) {
				System.out.println("�ѯ��y");
				System.out.println("�S��:�ʮ�ũM�꺡�A�����Ƴ��O�����e���D");
			}
			else {
				System.out.println("���Ȯy");
				System.out.println("�S��:�R���F�гy�P�o���A���n����ı�B��j���N��");
			}
			break;
		case 11:
			if(D<=22) {
				System.out.println("���Ȯy");
				System.out.println("�S��:�R���F�гy�P�o���A���n����ı�B��j���N��");
			}
			else {
				System.out.println("�g��y");
				System.out.println("�S��:�өʱR�|�ۥѡA���@���H���");
			}
			break;
		case 12:
			if(D<=21) {
				System.out.println("�g��y");
				System.out.println("�S��:�өʱR�|�ۥѡA���@���H���");
			}
			else {
				System.out.println("�]�~�y");
				System.out.println("�S��:�өʫO�u�A�Q���ԷV�ӥB���}");
			}
			break;
		}
	}
	
	//�p��|�~�A�^��0�άO1�A�b�Ѽƭp��ɨϥ�
	public static int LeapYear(int year)
	{
		year=year+1911;//�����褸
		
		if(year%4!=0 || (year%100==0 && year%400!=0))//�O�|�~�����p
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	
	//�p��A��~
	public static void LunarYear(int year)
	{
		String x=new String();
		String y=new String();
		//�Υ���1�~��@��¦�I(�Фl�~)�A�]���Ѥz��10�Ӧ]��%10
		if(year%10==3)
			x="��";
		else if(year%10==4)
			x="�A";
		else if(year%10==5)
			x="��";
		else if(year%10==6)
			x="�B";
		else if(year%10==7)
			x="��";
		else if(year%10==8)
			x="�v";
		else if(year%10==9)
			x="��";
		else if(year%10==0)
			x="��";
		else if(year%10==1)
			x="��";
		else if(year%10==2)
			x="��";
		
		//�Υ���1�~��@��¦�I(�Фl�~)�A�]���a�䦳12�Ӧ]��%12
		if(year%12==1)
			y="�l";
		else if(year%12==2)
			y="��";
		else if(year%12==3)
			y="�G";
		else if(year%12==4)
			y="�f";
		else if(year%12==5)
			y="��";
		else if(year%12==6)
			y="�x";
		else if(year%12==7)
			y="��";
		else if(year%12==8)
			y="��";
		else if(year%12==9)
			y="��";
		else if(year%12==10)
			y="��";
		else if(year%12==11)
			y="��";
		else if(year%12==0)
			y="��";
		System.out.println("�A��~:"+x+y);
		
	}
	
	//�p��ͨv�A��k�P�a��p��
	public static void ChineseZodiac(int year)
	{
		String y=new String();
		if(year%12==1)
			y="��";
		else if(year%12==2)
			y="��";
		else if(year%12==3)
			y="��";
		else if(year%12==4)
			y="��";
		else if(year%12==5)
			y="�s";
		else if(year%12==6)
			y="�D";
		else if(year%12==7)
			y="��";
		else if(year%12==8)
			y="��";
		else if(year%12==9)
			y="�U";
		else if(year%12==10)
			y="��";
		else if(year%12==11)
			y="��";
		else if(year%12==0)
			y="��";
		System.out.println("�ͨv:"+y);
	}
	
	//�p��P��
	public static void week(int year, int month, int day, int L)
	{
		System.out.printf("�P���X? ");
		year=year+1911;//�褸�~
		int countDay=0;//�q�X�ͤ�������@�~�@��@�骺�Ѽ�
		
		//�p��~���ֿn���Ѽ�
		for(int i=1912; i<year;i++) 
		{
			//�q1912�~�}�l�p��A�p�G�O�|�~�h�ֿn�W�[365��
			if(i%4!=0 || (i%100==0 && i%400!=0))
			{
				countDay+=365;
			}
			else//�q1912�~�}�l�p��A�p�G�D�|�~�h�ֿn�W�[366��
			{
				countDay+=366;
			}
		}
		
		//�p�����ֿn���Ѽ�
		switch(month-1)
		{
		case 11:
			countDay=countDay+30;
		case 10:
			countDay=countDay+31;
		case 9:
			countDay=countDay+30;
		case 8:
			countDay=countDay+31;
		case 7:
			countDay=countDay+31;
		case 6:
			countDay=countDay+30;
		case 5:
			countDay=countDay+31;
		case 4:
			countDay=countDay+30;
		case 3:
			countDay=countDay+31;
		case 2:
			countDay=countDay+28+L;//�[�W���~LeapYear()�^�ǭ�(�|�~+1/�D�|�~+0)
		case 1:
			countDay=countDay+31;
		default:
			break;	
		}
		
		//�p�����ֿn���Ѽ�
		countDay=countDay+day-1;
		
		//�@�P�C�ѡA�βֿn�Ѽ�%7�o��P��
		switch(countDay%7)
		{
		case 1:
			System.out.println("�P���G");
			break;
		case 2:
			System.out.println("�P���T");
			break;
		case 3:
			System.out.println("�P���|");
			break;
		case 4:
			System.out.println("�P����");
			break;
		case 5:
			System.out.println("�P����");
			break;
		case 6:
			System.out.println("�P����");
			break;
		default:
			System.out.println("�P���@");
			break;
		}
		
	}
	
	public static void BirthTime(int time)
	{
		String y=new String();
		//if/else�P�_�ɨ�
		if(time<=1 || time==23)
			y="�l";
		else if(time<=3)
			y="��";
		else if(time<=5)
			y="�G";
		else if(time<=7)
			y="�f";
		else if(time<=9)
			y="��";
		else if(time<=11)
			y="�x";
		else if(time<=13)
			y="��";
		else if(time<=15)
			y="��";
		else if(time<=17)
			y="��";
		else if(time<=19)
			y="��";
		else if(time<=21)
			y="��";
		else
			y="��";
		System.out.println("�ɨ�:"+y+"��");
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int year=0, month=0, day=0, time=0, flag=1;
		while(flag==1) 
		{
			flag=0;
			System.out.print("��J�X�ͦ~(����):");
			year=sc.nextInt();
			System.out.print("��J�X�ͤ�:");
			month=sc.nextInt();
			System.out.print("��J�X�ͤ�:");
			day=sc.nextInt();
			System.out.print("��J�X�ͮɨ�(0~23):");
			time=sc.nextInt();
			
			//�P�_��J�ȬO�_�X�z
			if(year<=0 || month>12 || time>23)
			{
				System.out.println("�ͤ�榡���~�A�Э��s��J");
				flag=1;
			}
			else {
				switch(month)
				{
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if(day>31)
					{
						System.out.println("�ͤ�榡���~�A�Э��s��J");
						flag=1;
					}
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if(day>30)
					{
						System.out.println("�ͤ�榡���~�A�Э��s��J");
						flag=1;
					}
					break;
				default:
					if((LeapYear(year)==1 && day>30)||(LeapYear(year)==0 && day>29))
					{
						System.out.println("�ͤ�榡���~�A�Э��s��J");
						flag=1;
					}	
					break;
				}
			}
		}
		zodiac(month, day);
		int L=LeapYear(year);
		System.out.printf("�O�|�~��? ");
		if(L==0)
			System.out.println("NO");
		else
			System.out.println("YES");
		LunarYear(year);
		ChineseZodiac(year);
		week(year, month, day, L);
		BirthTime(time);
		sc.close();
	}
}
