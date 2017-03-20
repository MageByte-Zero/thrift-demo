package zero.thrift.service;

import org.apache.thrift.TException;

import zero.thrift.face.HelloWorldService;

/**
 * 实现thrift生成的接口,主要业务逻辑
 * @author unique
 *
 */
public class HelloworlServiceImpl implements HelloWorldService.Iface {

	public String sayHello(String username) throws TException {
		return "Hi," + username + " welcome to my blog www.jmust.com";  
	}
}
