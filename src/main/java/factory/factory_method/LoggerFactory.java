package factory.factory_method;

//日志记录器工厂接口：抽象工厂
abstract class LoggerFactory {
	abstract Logger createLogger();
	abstract Logger createLogger(String args);
	abstract Logger createLogger(Object obj);

	public void writeLog() {
		Logger logger = this.createLogger();
		logger.writeLog();
	}
}
