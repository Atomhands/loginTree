package com.niehao.error;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * ClassName: AccountOrPasswordErrorException
 * Package: com.niehao.error
 * Description:
 *
 * @Author NieHao
 * @Create 2023/9/5 21:29
 * @Version 1.0
 */
@NoArgsConstructor
public class AccountOrPasswordErrorException extends RuntimeException{
    public AccountOrPasswordErrorException(String message){
        super(message);
    }
}
