package com.gwh.walkplanet.ui.activity.demo.page

import com.gwh.walkplanet.R
import com.gwh.walkplanet.databinding.FragmentTestPagerBinding
import com.vip.base.fragment.BaseFragment

/**
 *AUTHOR:AbnerMing
 *DATE:2022/9/1
 *INTRODUCE:测试Fragment,简单继承
 */
class TestPagerFragment : BaseFragment<FragmentTestPagerBinding>(R.layout.fragment_test_pager) {

    override fun initData() {
    }

    /**
     * AUTHOR:AbnerMing
     * INTRODUCE:测试改变文字
     */
    fun changeText(s: String) {
        mBinding.tvContent.text = s
    }
}
