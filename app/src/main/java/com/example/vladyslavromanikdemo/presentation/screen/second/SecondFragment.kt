package com.example.vladyslavromanikdemo.presentation.screen.second

import androidx.navigation.fragment.navArgs
import com.example.vladyslavromanikdemo.R
import com.example.vladyslavromanikdemo.databinding.FragmentSecondBinding
import com.example.vladyslavromanikdemo.presentation.base.BaseFragment
import com.example.vladyslavromanikdemo.presentation.model.ProductNamePresentationModel
import com.example.vladyslavromanikdemo.utils.viewbinding.viewBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class SecondFragment : BaseFragment<FragmentSecondBinding, SecondViewModel>(
    R.layout.fragment_second
) {

    override val binding by viewBinding({
        FragmentSecondBinding.bind(it)
    })

    override val viewModel by viewModel<SecondViewModel>()

    private val args: SecondFragmentArgs by navArgs()
    private val argsData: ProductNamePresentationModel
        get() = args.productNamePresentationModel

    override fun setUpView() {
        binding.productNameTextView.text = argsData.name
    }

}