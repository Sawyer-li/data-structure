package �Լ���˳���;

public class List_Init {
	static final int MAXLEN =100;
	Data[] arrData= new Data[MAXLEN+1];
	private int nowNum = 0;              //ָ����β��Ҫ��ӵ�λ��   Ҳ���ⲿ�ĳ���     Ҳ�����ڳ���+1
	public int getNowNum() {
		return nowNum;
	}
	/**********       ���뷽��                 **********/
	public int inner(int n,Data data){
		 n = --n;               
		if(this.nowNum>=MAXLEN){
			System.out.println("�Ѿ����˻���");
			return 0;
		}
		
		if(n<0||n>this.nowNum){
			System.out.println("�������Խ��");
			return 0;
		}
		
		for(int i = this.nowNum; i>n; i-- ){
			arrData[i] = arrData[i-1];
		}
		arrData[n] = data;
		nowNum++;
		return 1;
	}
	/*********     ׷��һ��Ԫ��     ***********/
	public void add(Data data){
		if(nowNum == 0){
			arrData[0] = data; 
		}else{
			arrData[nowNum] = data;
		}
		nowNum++;
	}
	
	/********       �鿴һ��Ԫ��                       ******/
	public int showOne(int num){
		num--;
		System.out.println("��ţ�"+arrData[num].key+"\t\t"+"���֣�"+arrData[num].name+"\t\t"+"���䣺"+arrData[num].age );
		return 0 ;
	}
	
	/**********     ɾ��һ��Ԫ��                  **********/
	public int delete(int num){
		num--;
		if(num>=nowNum){
			System.out.println("û����ô����ôɾ��");
			return 0;
		}
	
		for(int i=num;i<nowNum;i++)
			arrData[i]=arrData[i+1];
		num++;
		System.out.println("�ɹ�ɾ����"+num+"λԪ��");
		nowNum--;

		return 1;
	}
	
	/**********   ��ʾȫ������                  **********/
	public void  showAll(){
		if(this.nowNum == -1){
			System.out.println("�ֵ����Ǹ��յı�");
		}else{
			for(int i=0;i<this.nowNum;i++){
				System.out.println("��ţ�"+arrData[i].key+"\t\t"+"���֣�"+arrData[i].name+"\t\t"+"���䣺"+arrData[i].age);
			}
		}
	}
}
