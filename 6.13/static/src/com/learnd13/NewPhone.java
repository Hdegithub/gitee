package com.learnd13;

public class NewPhone extends Phone {
    @Override
    public void call() {
        super.call();
        System.out.println("还可以打视频电话");
    }

    @Override
    public void duanxin() {
        super.duanxin();
        System.out.println("还可以发语音");
    }
}
