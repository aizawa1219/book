//Dao層で指定されたレコードが存在しない場合に投げられる例外クラス
package com.example.demo.common;

	public class DataNotFoundException extends Exception {
		public DataNotFoundException() {
		}

		public DataNotFoundException(String msg) {
			super(msg);
		}

		public DataNotFoundException(Throwable th) {
			super(th);
		}

		public DataNotFoundException(String msg, Throwable th) {
			super(msg, th);
		}
	}

