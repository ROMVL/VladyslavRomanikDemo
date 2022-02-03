package com.example.vladyslavromanikdemo.presentation.screen.first

import com.example.vladyslavromanikdemo.R
import com.example.vladyslavromanikdemo.databinding.FragmentFirstBinding
import com.example.vladyslavromanikdemo.presentation.base.BaseFragment
import com.example.vladyslavromanikdemo.presentation.model.ProductNamePresentationModel
import com.example.vladyslavromanikdemo.utils.viewbinding.viewBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class FirstFragment : BaseFragment<FragmentFirstBinding, FirstViewModel>(
    R.layout.fragment_first
) {

    override val binding by viewBinding({
        FragmentFirstBinding.bind(it)
    })

    override val viewModel by viewModel<FirstViewModel>()

    private val adapter: ProductsAdapter by lazy {
        ProductsAdapter(
            onProductItemClickAction()
        )
    }

    override fun setUpView() {
        binding.recyclerView.adapter = adapter
    }

    override fun observeViewModel() {
        with(viewModel) {
            productListDataState.listenValue {
                adapter.submitList(it)
            }
        }
    }

    private fun onProductItemClickAction(): (ProductNamePresentationModel) -> Unit = {
        navigateToSecondFragment(it)
    }

    // Should be wrapped with router class in big projects
    private fun navigateToSecondFragment(data: ProductNamePresentationModel) {
        FirstFragmentDirections.actionFirstFragmentToSecondFragment(
            data
        ).go()
    }

}
