import java.util.ArrayList;


public class Player {
	private String name;//新增一個private String name
	private int chips;//新增一個private int chips 
	private int bet; //新增一個private int bet
	private ArrayList<Card> oneRoundCard;//新增一個private ArrayList<Card> oneRoundCard
	/**
	 * constructor為Player(name,chips)
	 * @param name
	 * @param chips
	 */
	public Player(String name, int chips){
		this.name=name;
		this.chips=chips;
	}
	/**方法getName()
	回傳name
	*/
	public String getName(){
		return name;
	}
	/**方法makeBet()
	 * 假設一次下注籌碼為5元
	 * 當下注籌碼為0元(沒錢了)就回傳0
	 * 否則就回傳bet
	 */
	public int makeBet(){
		bet=5;
		while(bet==0){
			return 0;
		}
		return bet;
	}
	/**方法setOneRoundCard
	 * oneRoundCard新增為一個ArrayList
	 * 設定此牌局的卡的等於cards
	 */
	public void setOneRoundCard(ArrayList cards){
		oneRoundCard=new ArrayList<Card>();
		oneRoundCard=cards;
	}
	/**方法hitMe()
	 * 如果點數總和小於等於16就回傳true
	 * 否則回傳false
	 */
	public boolean hitMe(){
		
		if(getTotalValue()<=16){
			return true;
		}
		else
			return false;
	}
	/**方法getTotalValue()
	 * 假設總點數total為0
	 * 將此牌局的卡都放進去算
	 * 如果牌的數字等於11或12或13，就當10計算
	 * 否則就以原本的1~10去計算
	 * 回傳total
	 */
	public int getTotalValue(){
		int total=0;
		for(int i=0;i<oneRoundCard.size();i++){
			if(oneRoundCard.get(i).getRank()==11||oneRoundCard.get(i).getRank()==12||oneRoundCard.get(i).getRank()==13){
				total+=10;
			}
			else{
				total+=oneRoundCard.get(i).getRank();
			}
		}
		return total;	
	}
	/**方法getCurrentChips()
	 * 回傳chips
	 */
	public int getCurrentChips(){
		return chips;
	}
	/**方法increaseChips
	 *籌碼變動
	 */
	public void increaseChips (int diff){
		chips+=diff;
	}
	/**方法sayHello()
	 * 玩家sayHello
	 */
	public void sayHello(){
		System.out.println("Hello, I am " + name + ".");
		System.out.println("I have " + chips + " chips.");
	}
}
