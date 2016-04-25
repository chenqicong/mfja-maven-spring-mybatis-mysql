package com.lib.enumLib;

import java.util.Map;
import java.util.HashMap;


public class ResStatusEnum {
	
	public enum ErrStatus {
		SUCCESS(0, "You operation is success!"),
		FAILURE(9, "You operation is fail!"),
		UNDEFINE(10, "Undefine");
		
		private int code;
		private String value;
		
		
		private ErrStatus (int code, String value) {
			this.setEnum(code, value);
		}
		
		public String getValue() {
			return this.value;
		}
		
		public int getKey() {
			return this.code;
		}
		
		public void setEnum(int code, String value) {
			this.code = code;
			this.value = value;
		}
		
		public void setRes() {
			ErrRes.RES.setStatus(this.code, this.value);
		}
		
		@Override
		public String toString() {
			return String.valueOf(this.code);
		}
	}
	
	
	public enum ErrRes {
		RES(new HashMap<String, Object>());
		
		private Map<String, Object> res;
		
		private ErrRes(Map<String, Object> res) {
			this.res = res;
		}
		
		public void setErrRes(Object obj) {
			if (obj == null) {
				this.res.put("res", new HashMap<String, Object>());
			}else {
				this.res.put("res", obj);
			}
		}
		
		public void setDefault() {
			this.res.put("res", new HashMap<String, Object>());
			ErrStatus.FAILURE.setRes();
		}
		
		public void setStatus(int key, String value) {
			this.res.put("status", key);
			this.res.put("msg", value);
		}
		
		public Map<String, Object> getValue() {
			return this.res;
		}
	}
}

