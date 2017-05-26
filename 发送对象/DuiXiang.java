package Com.Dzhi;

import java.io.*;

public class DuiXiang implements Serializable{ 
	private String toName;
	private String xiaoxi;
	public DuiXiang(String toName,String xiaoxi){
		this.toName=toName;
		this.setXiaoxi(xiaoxi);
	}
	public String getToName() {
		return toName;
	}
	public void setToName(String toName) {
		this.toName = toName;
	}
	public String toString(){
		return "发送至{"+
				"name="+toName+ ",消息="+xiaoxi+
						"}";
		
	}
	public String getXiaoxi() {
		return xiaoxi;
	}
	public void setXiaoxi(String xiaoxi) {
		this.xiaoxi = xiaoxi;
	}
}
