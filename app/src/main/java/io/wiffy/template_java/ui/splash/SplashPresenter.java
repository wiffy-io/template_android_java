package io.wiffy.template_java.ui.splash;

class SplashPresenter implements SplashContract.Presenter {

    SplashContract.View mView;

    SplashPresenter(SplashContract.View mView) {
        this.mView = mView;
    }

    @Override
    public void check() {

    }

    @Override
    public int console(String str) {
        return 0;
    }

    @Override
    public int console(String tag, String str) {
        return 0;
    }

    @Override
    public void initPresent() {

    }
}
