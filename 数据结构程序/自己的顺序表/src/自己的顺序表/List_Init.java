package 自己的顺序表;

public class List_Init {
	static final int MAXLEN =100;
	Data[] arrData= new Data[MAXLEN+1];
	private int nowNum = 0;              //指队列尾部要添加的位置   也是外部的长度     也是现在长度+1
	public int getNowNum() {
		return nowNum;
	}
	/**********       插入方法                 **********/
	public int inner(int n,Data data){
		 n = --n;               
		if(this.nowNum>=MAXLEN){
			System.out.println("已经满了还插");
			return 0;
		}
		
		if(n<0||n>this.nowNum){
			System.out.println("你的输入越界");
			return 0;
		}
		
		for(int i = this.nowNum; i>n; i-- ){
			arrData[i] = arrData[i-1];
		}
		arrData[n] = data;
		nowNum++;
		return 1;
	}
	/*********     追加一个元素     ***********/
	public void add(Data data){
		if(nowNum == 0){
			arrData[0] = data; 
		}else{
			arrData[nowNum] = data;
		}
		nowNum++;
	}
	
	/********       查看一个元素                       ******/
	public int showOne(int num){
		num--;
		System.out.println("序号："+arrData[num].key+"\t\t"+"名字："+arrData[num].name+"\t\t"+"年龄："+arrData[num].age );
		return 0 ;
	}
	
	/**********     删除一个元素                  **********/
	public int delete(int num){
		num--;
		if(num>=nowNum){
			System.out.println("没有那么长怎么删除");
			return 0;
		}
	
		for(int i=num;i<nowNum;i++)
			arrData[i]=arrData[i+1];
		num++;
		System.out.println("成功删除了"+num+"位元素");
		nowNum--;

		return 1;
	}
	
	/**********   显示全部数据                  **********/
	public void  showAll(){
		if(this.nowNum == -1){
			System.out.println("兄弟这是个空的表");
		}else{
			for(int i=0;i<this.nowNum;i++){
				System.out.println("序号："+arrData[i].key+"\t\t"+"名字："+arrData[i].name+"\t\t"+"年龄："+arrData[i].age);
			}
		}
	}
}
