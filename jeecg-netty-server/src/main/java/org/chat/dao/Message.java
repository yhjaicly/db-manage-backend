package org.chat.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 消息体
 *
 * @author Administrator
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message implements Serializable {

    /**
     * 发送者
     */
    private String send;

    /**
     * 接收者
     */
    private String receive;

    /**
     * 消息id
     */
    private String id;

    /**
     * 消息值
     */
    private String info;


    /**
     * 类型 1 上线 2发消息 3 私聊
     */
    private int type;
}