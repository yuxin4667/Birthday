import java.util.*;
public class birthday 
{

	//計算星座
	public static void zodiac(int M, int D)
	{
		System.out.print("星座:");
		//switch判斷月份，將星座範圍縮小至兩種
		switch(M)
		{
		case 1:
			//if/else判斷日期，確認星座種類
			if(D<=20) {
				System.out.println("魔羯座");
				System.out.println("特質:個性保守，十分謹慎而且馴良");
			}
				
			else {
				System.out.println("水瓶座");
				System.out.println("特質:為人善變，很活潑也很有表現力，個性溫和");
			}
			break;
		case 2:
			if(D<=19) {
				System.out.println("水瓶座");
				System.out.println("特質:為人善變，很活潑也很有表現力，個性溫和");
			}
			else {
				System.out.println("雙魚座");
				System.out.println("特質:具有磁性、吸引人，使人很樂於和他相處");
			}
			break;	
		case 3:
			if(D<=20) {
				System.out.println("雙魚座");
				System.out.println("特質:具有磁性、吸引人，使人很樂於和他相處");
			}
			else {
				System.out.println("白羊座");
				System.out.println("特質:具有創造力、活力十足");
			}
			break;
		case 4:
			if(D<=20) {
				System.out.println("白羊座");
				System.out.println("特質:具有創造力、活力十足");
			}
			else {
				System.out.println("金牛座");
				System.out.println("特質:熱情、衝動、柔順、敏感、依賴");
			}
			break;
		case 5:
			if(D<=21) {
				System.out.println("金牛座");
				System.out.println("特質:熱情、衝動、柔順、敏感、依賴");
			}
			else {
				System.out.println("雙子座");
				System.out.println("特質:智商高，反應快，並且能言善道");
			}
			break;
		case 6:
			if(D<=21) {
				System.out.println("雙子座");
				System.out.println("特質:智商高，反應快，並且能言善道");
			}
			else {
				System.out.println("巨蟹座");
				System.out.println("特質:為人和藹可親，也很有責任感");
			}
			break;
		case 7:
			if(D<=22) {
				System.out.println("巨蟹座");
				System.out.println("特質:為人和藹可親，也很有責任感");
			}
			else {
				System.out.println("獅子座");
				System.out.println("特質:具有幽默感，生性快樂活潑，容易吸引人");
			}
			break;
		case 8:
			if(D<=22) {
				System.out.println("獅子座");
				System.out.println("特質:具有幽默感，生性快樂活潑，容易吸引人");
			}
			else {
				System.out.println("處女座");
				System.out.println("特質:具有平靜、知足的心，而且充滿了信心");
			}
			break;
		case 9:
			if(D<=23) {
				System.out.println("處女座");
				System.out.println("特質:具有平靜、知足的心，而且充滿了信心");
			}
			else {
				System.out.println("天秤座");
				System.out.println("特質:性格溫和圓滿，對任何事都保持中庸之道");
			}
			break;
		case 10:
			if(D<=23) {
				System.out.println("天秤座");
				System.out.println("特質:性格溫和圓滿，對任何事都保持中庸之道");
			}
			else {
				System.out.println("天蠍座");
				System.out.println("特質:充滿了創造與發明，有好的直覺、堅強的意志");
			}
			break;
		case 11:
			if(D<=22) {
				System.out.println("天蠍座");
				System.out.println("特質:充滿了創造與發明，有好的直覺、堅強的意志");
			}
			else {
				System.out.println("射手座");
				System.out.println("特質:個性崇尚自由，不願受人拘束");
			}
			break;
		case 12:
			if(D<=21) {
				System.out.println("射手座");
				System.out.println("特質:個性崇尚自由，不願受人拘束");
			}
			else {
				System.out.println("魔羯座");
				System.out.println("特質:個性保守，十分謹慎而且馴良");
			}
			break;
		}
	}
	
	//計算閏年，回傳0或是1，在天數計算時使用
	public static int LeapYear(int year)
	{
		year=year+1911;//換成西元
		
		if(year%4!=0 || (year%100==0 && year%400!=0))//是閏年的情況
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	
	//計算農曆年
	public static void LunarYear(int year)
	{
		String x=new String();
		String y=new String();
		//用民國1年當作基礎點(壬子年)，因為天干有10個因此%10
		if(year%10==3)
			x="甲";
		else if(year%10==4)
			x="乙";
		else if(year%10==5)
			x="丙";
		else if(year%10==6)
			x="丁";
		else if(year%10==7)
			x="戊";
		else if(year%10==8)
			x="己";
		else if(year%10==9)
			x="庚";
		else if(year%10==0)
			x="辛";
		else if(year%10==1)
			x="壬";
		else if(year%10==2)
			x="癸";
		
		//用民國1年當作基礎點(壬子年)，因為地支有12個因此%12
		if(year%12==1)
			y="子";
		else if(year%12==2)
			y="丑";
		else if(year%12==3)
			y="寅";
		else if(year%12==4)
			y="卯";
		else if(year%12==5)
			y="辰";
		else if(year%12==6)
			y="巳";
		else if(year%12==7)
			y="午";
		else if(year%12==8)
			y="未";
		else if(year%12==9)
			y="申";
		else if(year%12==10)
			y="酉";
		else if(year%12==11)
			y="戌";
		else if(year%12==0)
			y="亥";
		System.out.println("農曆年:"+x+y);
		
	}
	
	//計算生肖，方法同地支計算
	public static void ChineseZodiac(int year)
	{
		String y=new String();
		if(year%12==1)
			y="鼠";
		else if(year%12==2)
			y="牛";
		else if(year%12==3)
			y="虎";
		else if(year%12==4)
			y="兔";
		else if(year%12==5)
			y="龍";
		else if(year%12==6)
			y="蛇";
		else if(year%12==7)
			y="馬";
		else if(year%12==8)
			y="羊";
		else if(year%12==9)
			y="猴";
		else if(year%12==10)
			y="雞";
		else if(year%12==11)
			y="狗";
		else if(year%12==0)
			y="豬";
		System.out.println("生肖:"+y);
	}
	
	//計算星期
	public static void week(int year, int month, int day, int L)
	{
		System.out.printf("星期幾? ");
		year=year+1911;//西元年
		int countDay=0;//從出生日期到民國一年一月一日的天數
		
		//計算年份累積的天數
		for(int i=1912; i<year;i++) 
		{
			//從1912年開始計算，如果是閏年則累積增加365天
			if(i%4!=0 || (i%100==0 && i%400!=0))
			{
				countDay+=365;
			}
			else//從1912年開始計算，如果非閏年則累積增加366天
			{
				countDay+=366;
			}
		}
		
		//計算月份累積的天數
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
			countDay=countDay+28+L;//加上今年LeapYear()回傳值(閏年+1/非閏年+0)
		case 1:
			countDay=countDay+31;
		default:
			break;	
		}
		
		//計算日期累積的天數
		countDay=countDay+day-1;
		
		//一周七天，用累積天數%7得到星期
		switch(countDay%7)
		{
		case 1:
			System.out.println("星期二");
			break;
		case 2:
			System.out.println("星期三");
			break;
		case 3:
			System.out.println("星期四");
			break;
		case 4:
			System.out.println("星期五");
			break;
		case 5:
			System.out.println("星期六");
			break;
		case 6:
			System.out.println("星期日");
			break;
		default:
			System.out.println("星期一");
			break;
		}
		
	}
	
	public static void BirthTime(int time)
	{
		String y=new String();
		//if/else判斷時辰
		if(time<=1 || time==23)
			y="子";
		else if(time<=3)
			y="丑";
		else if(time<=5)
			y="寅";
		else if(time<=7)
			y="卯";
		else if(time<=9)
			y="辰";
		else if(time<=11)
			y="巳";
		else if(time<=13)
			y="午";
		else if(time<=15)
			y="未";
		else if(time<=17)
			y="申";
		else if(time<=19)
			y="酉";
		else if(time<=21)
			y="戌";
		else
			y="亥";
		System.out.println("時辰:"+y+"時");
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int year=0, month=0, day=0, time=0, flag=1;
		while(flag==1) 
		{
			flag=0;
			System.out.print("輸入出生年(民國):");
			year=sc.nextInt();
			System.out.print("輸入出生月:");
			month=sc.nextInt();
			System.out.print("輸入出生日:");
			day=sc.nextInt();
			System.out.print("輸入出生時刻(0~23):");
			time=sc.nextInt();
			
			//判斷輸入值是否合理
			if(year<=0 || month>12 || time>23)
			{
				System.out.println("生日格式錯誤，請重新輸入");
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
						System.out.println("生日格式錯誤，請重新輸入");
						flag=1;
					}
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if(day>30)
					{
						System.out.println("生日格式錯誤，請重新輸入");
						flag=1;
					}
					break;
				default:
					if((LeapYear(year)==1 && day>30)||(LeapYear(year)==0 && day>29))
					{
						System.out.println("生日格式錯誤，請重新輸入");
						flag=1;
					}	
					break;
				}
			}
		}
		zodiac(month, day);
		int L=LeapYear(year);
		System.out.printf("是閏年嗎? ");
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
