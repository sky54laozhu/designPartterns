package factory.factory_method;

//文件日志记录器：具体产品
class RedisLogger implements Logger {
	@Override
	public void writeLog() {
		System.out.println("缓存日志记录。");
	}
}