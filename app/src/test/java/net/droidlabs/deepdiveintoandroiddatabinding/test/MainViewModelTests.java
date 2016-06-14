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
        final MainViewModel viewModel = new MainViewModel(sendService);
        final String givenText = "my text";

        viewModel.setTwoWayText(givenText);
        viewModel.sendAction();

        verify(sendService).send(givenText);
    }
}