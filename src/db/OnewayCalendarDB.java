package db;

public class OnewayCalendarDB {

	/*
	 * 数据库名
	 */
	public static final String DB_NAME = "oneway_calendar";
	
	/*
	 * 数据库版本
	 */
	public static final int VERSION = 1;
	
	private static OnewayCalendarDB onewayCalendarDB;
	
	//private SQLiteDatabase db;
	
	/*
	 * 将构造方法私有化
	
	private OnewayCalendarDB(Context context){
		OnewayCalendarOpenHelper dbHelper = new OnewayCalendarOpenHelper(context, DB_NAME, null, VERSION);
		db = dbHelper..getWritableDatabase();
	} 
	
	//获取OnewayCalendarDB的实例
	
	public synchronized static OnewayCalendarDB getInstance(Context context){
		if(onewayCalendarDB == null){
			onewayCalendarDB == new OnewayCalendar(context);
			} 
			return onewayCalendarDB;
	}
	
	//将Userdata实例存储到数据库
	public void saveUserdata(Userdata userdata){
		if(userdate == null){
			ContentValues values = new Contentvalues();
			values.put("date",userdata.getdate());
			values.put("todo",userdata.gettodo());
			values.put("doneoryet",userdata.getdoneoryet());
			values.put("bubble",userdata.getbubble());
			db.insert("Userdata", null, values);
		}
	}
	
	//从数据库中读取所有的用户数据
	 public List<Userdata> loadUserdata(){
	 	List<Userdata> list = new ArrayList<Userdata>();
	 	Cursor cursor = db.query("Userdata", null, null, null, null, null, null);
	 	if(cursor.moveToFirst()){
	 		do{
	 			Userdata userdata = new Userdata();
	 			userdata.setdate(cursor.getString(cursor.getColumnIndex("date")));
	 			userdata.sattodo(cursor.getString(cursor.getColumnIndex("todo")));
	 			userdata.setdoneoryet(cursor.getInt(cursor.getColumnIndex("doneoryet")));
	 			userdata.setbubble(cursor.getString(cursor.getColumnIndex("bubble")));
	 			list.add(userdata);
	 		}while(cursor.moveToNext());
	 	}
	 	if(cursor != null){
	 		cursor.close();
	 	}
	 	return list;
	 }
	 
	*/
}
