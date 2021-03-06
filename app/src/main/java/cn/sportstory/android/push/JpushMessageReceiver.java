package cn.sportstory.android.push;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import org.json.JSONException;
import org.json.JSONObject;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by aaron on 2017/5/1.
 */

public class JpushMessageReceiver extends BroadcastReceiver {

    private static final String TAG = "JpushMessageReceiver";

    private NotificationManager manager;

    private static final String MSG_TYPE_COMMENT =  "CUSTOM_PUSH_TYPE_TIMELINE_COMMENT";
    private static final String MSG_TYPE_FOLLOW =  "CUSTOM_PUSH_TYPE_FOLLOW";
    private static final String MSG_TYPE_LIKE =  "CUSTOM_PUSH_TYPE_TIMELINE_LIKE";
    private static final String MSG_TYPE_OFFLINE_ACTIVITY =  "CUSTOM_PUSH_TYPE_OFFLINE_ACTIVITY";
    private static final String MSG_TYPE_NEW_NEARBY =  "CUSTOM_PUSH_TYPE_NEW_NEARBY";
    private static final String MSG_TYPE_OPEN_H5 =  "CUSTOM_PUSH_TYPE_OPEN_H5";



    @Override
    public void onReceive(Context context, Intent intent) {

        if (null == manager)
        {
            manager = (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
        }
        Bundle bundle = intent.getExtras();
        if (JPushInterface.ACTION_REGISTRATION_ID.equals(intent.getAction()))
        {
            //jpush用户注册成功
        }else if (JPushInterface.ACTION_MESSAGE_RECEIVED.equals(intent.getAction()))
        {
            //接收到自定义消息
            processCustomMessage(context, bundle);
        }else if (JPushInterface.ACTION_NOTIFICATION_RECEIVED.equals(intent.getAction()))
        {
            // 接收到推送通知
            receiveNotification(context, bundle);
        } else if (JPushInterface.ACTION_NOTIFICATION_OPENED.equals(intent.getAction()))
        {
            //用户点击打开了停通知
            openNotification(context, bundle);
        }else {
            //unhandled intent
        }

    }

    /**
     * 处理自定义消息
     * @param context
     * @param bundle
     */
    private void processCustomMessage(Context context, Bundle bundle){


    }

    /**
     * 接收到推送消息
     * @param context
     * @param bundle
     */
    private void receiveNotification(Context context, Bundle bundle){

    }

    private void openNotification(Context context, Bundle bundle){
        String extras = bundle.getString(JPushInterface.EXTRA_EXTRA);
        String messageType = "";
        try{
            JSONObject jsonObject = new JSONObject(extras);
            messageType = jsonObject.getString("key");

        }catch (JSONException e)
        {
            //解析消息失败
        }

        if (MSG_TYPE_COMMENT.equals(messageType)) {
            //处理评论消息
        } else if (MSG_TYPE_FOLLOW.equals(messageType)) {
            //处理关注消息
        } else if (MSG_TYPE_LIKE.equals(messageType)) {
            //处理点赞消息
        } else if (MSG_TYPE_NEW_NEARBY.equals(messageType)) {
            //处理有新用户加入消息消息
        } else if (MSG_TYPE_OFFLINE_ACTIVITY.equals(messageType)) {
            //处理线下活动消息
        } else if (MSG_TYPE_OPEN_H5.equals(messageType)) {
            //打开h5页面
        }else {
            //其他消息类型
        }

    }


}
