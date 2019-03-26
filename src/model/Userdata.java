package model;

public class Userdata {
	private String date;
	private String todo;
	private int doneoryet;//取值0、1分别表示未做和已做
	private String bubble;
	
	
	public void setdate(String date){
		this.date = date;
	}
	public void settodo(String todo){
		this.todo = todo;
	}
	public void setdoneoryet(int doneoryet){
		this.doneoryet = doneoryet;
	}
	public void setbubble(String bubble){
		this.bubble = bubble;
	}
	
	
	public String getdate(String date){
		return date;
	}
	public String gettodo(String todo){
		return todo;
	}
	public int getdone(int doneoryet){
		return doneoryet;
	}
	public String getbubble(String bubble){
		return bubble;
	}
}
