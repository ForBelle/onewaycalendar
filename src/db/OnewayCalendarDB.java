package db;

public class OnewayCalendarDB {

	/*
	 * ���ݿ���
	 */
	public static final String DB_NAME = "oneway_calendar";
	
	/*
	 * ���ݿ�汾
	 */
	public static final int VERSION = 1;
	
	private static OnewayCalendarDB onewayCalendarDB;
	
	//private SQLiteDatabase db;
	
	/*
	 * �����췽��˽�л�
	
	private OnewayCalendarDB(Context context){
		OnewayCalendarOpenHelper dbHelper = new OnewayCalendarOpenHelper(context, DB_NAME, null, VERSION);
		db = dbHelper..getWritableDatabase();
	} 
	
	//��ȡOnewayCalendarDB��ʵ��
	
	public synchronized static OnewayCalendarDB getInstance(Context context){
		if(onewayCalendarDB == null){
			onewayCalendarDB == new OnewayCalendar(context);
			} 
			return onewayCalendarDB;
	}
	
	//��Userdataʵ���洢�����ݿ�
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
	
	//�����ݿ��ж�ȡ���е��û�����
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
