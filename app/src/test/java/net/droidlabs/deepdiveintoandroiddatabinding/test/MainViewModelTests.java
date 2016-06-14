package net.droidlabs.deepdiveintoandroiddatabinding.test;

import net.droidlabs.deepdiveintoandroiddatabinding.services.ISendService;
import net.droidlabs.deepdiveintoandroiddatabinding.viewmodel.MainViewModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class MainViewModelTests
{
    @Mock
    ISendService sendService;

    @Test
    public void mainViewModel_sendAction_sendService_send()
    {
        MainViewModel viewModel = new MainViewModel(sendService);

        viewModel.sendAction();

        verify(sendService).send();
    }
}