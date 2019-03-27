package factory.factory_method;

//文件日志记录器工厂类：具体工厂
class RedisLoggerFactory extends LoggerFactory {
	@Override
	public Logger createLogger() {
            //创建文件日志记录器对象
			Logger logger = new RedisLogger();
			//创建文件，代码省略
			return logger;
	}

	@Override
	public Logger createLogger(String args) {
		//创建文件日志记录器对象
		Logger logger = new RedisLogger();
		//创建文件，代码省略
		return logger;
	}

	@Override
	public Logger createLogger(Object obj) {
		//创建文件日志记录器对象
		Logger logger = new RedisLogger();
		//创建文件，代码省略
		return logger;
	}
}