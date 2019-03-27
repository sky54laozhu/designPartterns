package factory.factory_method;

class Client {
	public static void main(String args[]) {
		LoggerFactory factory;
		Logger logger,logger1;
		factory = (LoggerFactory)XMLUtil.getBean();
		factory.writeLog();
	}
}