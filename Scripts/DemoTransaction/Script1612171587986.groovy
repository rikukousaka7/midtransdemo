import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.URL)
WebUI.maximizeWindow()
WebUI.click(findTestObject('Object Repository/btn_BuyNow'), [('PARAM') : 'BUY NOW'], FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('Object Repository/txt_Amount'), Amount, FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('Object Repository/txt_Name'), Name, FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('Object Repository/txt_Email'), Email, FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('Object Repository/txt_PhoneNum'), Phonenumber, FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('Object Repository/txt_City'), City, FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('Object Repository/txt_Address'), Address, FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('Object Repository/txt_PostalCode'), PostalCode, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/btn_Checkout'), [('PARAM') : 'CHECKOUT'], FailureHandling.STOP_ON_FAILURE)
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/btn_Checkout'), [('PARAM') : 'Continue'], FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/btn_Checkout'), [('PARAM') : 'ATM/Bank Transfer'], FailureHandling.STOP_ON_FAILURE)
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/btn_ContinuePayment'), [('PARAM') : 'BCA'], FailureHandling.STOP_ON_FAILURE)
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/btn_ContinuePayment'), [('PARAM') : 'Please Complete Payment'], FailureHandling.STOP_ON_FAILURE)
if (WebUI.verifyElementText(findTestObject('Object Repository/btn_ContinuePayment'), [('PARAM') : Amount], Amount)) {
	WebUI.takeScreenshot('/Users/e101964/Downloads/Backup AIA/Midtrans/MidtransDemo/1.jpg')
} else {
	WebUI.verifyElementText(findTestObject('Object Repository/btn_ContinuePayment'), [('PARAM') : Amount], Amount, FailureHandling.STOP_ON_FAILURE)
	WebUI.closeBrowser()
}
WebUI.closeBrowser()


