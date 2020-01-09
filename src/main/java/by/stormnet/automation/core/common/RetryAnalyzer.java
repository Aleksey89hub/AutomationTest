//package by.stormnet.automation.core.common;
//
//import org.testng.IRetryAnalyzer;
//import org.testng.ITestResult;
//
//public class RetryAnalyzer implements IRetryAnalyzer {
//    int count =0;
//    int reTryLimit =0;
//
//    @Override
//    public boolean retry(ITestResult result){
//        if(count<reTryLimit){
//            count++;
//            return true;
//        }
//        return false;
//    }
//}
