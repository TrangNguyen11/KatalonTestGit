import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')
WebUI.navigateToUrl('http://www.lotteria.vn/vn/thuc-don/1/burger/')
WebUI.click(findTestObject('TC04_ThemSPKhacLoai/ChonGH/img'))
WebUI.click(findTestObject('TC04_ThemSPKhacLoai/BigStar/a_Chn'))
WebUI.delay(1)
WebUI.click(findTestObject('TC04_ThemSPKhacLoai/BigStar/img'))
WebUI.click(findTestObject('TC04_ThemSPKhacLoai/KhoaTayChip/a_Chn'))
WebUI.delay(1)
WebUI.click(findTestObject('TC04_ThemSPKhacLoai/KhoaTayChip/img'))
WebUI.click(findTestObject('TC04_ThemSPKhacLoai/GaLac/a_Chn'))
WebUI.delay(1)
WebUI.click(findTestObject('TC04_ThemSPKhacLoai/GaLac/img'))
WebUI.click(findTestObject('TC04_ThemSPKhacLoai/KhoaTay/a_Chn'))
WebUI.delay(1)
WebUI.click(findTestObject('TC04_ThemSPKhacLoai/KhoaTay/a_4'))

