package com.yupi.ojcodesandbox;

import com.yupi.ojcodesandbox.model.ExecuteCodeResponse;
import com.yupi.ojcodesandbox.model.ExecuteCodeRequest;

/**
 * 代码沙箱接口定义
 */

public interface CodeSandbox {

    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
