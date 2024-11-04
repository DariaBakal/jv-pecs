package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Your implementation of MachineService.
 */

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            return new ArrayList<>(bulldozerProducer.get());
        } else if (type == Excavator.class) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            return new ArrayList<>(excavatorProducer.get());
        } else if (type == Truck.class) {
            TruckProducer truckProducer = new TruckProducer();
            return new ArrayList<>(truckProducer.get());
        }
        return Collections.emptyList();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

