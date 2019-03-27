package factory.factory_method;

//数据库日志记录器：具体产品
class DatabaseLogger implements Logger {
	@Override
	public void writeLog() {
		System.out.println("数据库日志记录。");
	}
}