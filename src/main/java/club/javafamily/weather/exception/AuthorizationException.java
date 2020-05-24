package club.javafamily.weather.exception;

/**
 * 自定义异常, 表示 rest 服务认证失败.
 */
public class AuthorizationException extends RuntimeException {
   public AuthorizationException() {
      super();
   }

   public AuthorizationException(String message) {
      super(message);
   }

   public AuthorizationException(String message, Throwable cause) {
      super(message, cause);
   }
}
